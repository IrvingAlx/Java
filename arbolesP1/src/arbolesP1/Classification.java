package arbolesP1;


import com.mfg.utils.DataSourceUtils;
import com.mfg.utils.FileUtils;
import com.mfg.models.*;
import weka.classifiers.Classifier;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.J48;
import weka.classifiers.trees.RandomTree;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import java.io.File;
import java.util.Random;



public class Classification {

    public static final String TREE_UNPRUNED_OPT = "-U";

    public static void main(String [] args) throws Exception {

        // lectura de archivo
    	FileUtils fileUtils = new FileUtils();
        File file = fileUtils.getFile("heart.arff");

        // convierte del archivo a instancias.
        DataSourceUtils dataSourceUtils = new DataSourceUtils();
        Instances instances = dataSourceUtils.newWekaInstances(file);

        System.out.println(instances.toString());

        // Clase Método para generar el árbol  J48
        RandomTree tree = new RandomTree();
        String[] options = new String[1];
        options[0] = TREE_UNPRUNED_OPT;

        tree.setOptions(options);

        // genera el arbol de clasificación. 
        tree.buildClassifier(instances);

        System.out.println(tree);

        // un caso de prueba, se pone un nuevo objeto y basado en el árbol anterior
        // determina el valor de la funcion objetivo. 
        Instance instance = new DenseInstance(4);
        instance.setDataset(instances);
        instance.setValue(WeatherAttributesIndex.CLIMA.getIndex(),"Calor" );
        instance.setValue(WeatherAttributesIndex.VIVECONPADRES.getIndex(), "SI");
        instance.setValue(WeatherAttributesIndex.SITUACIONACADEMICA.getIndex(), "Buena");
       

        // resultado de la prueba
        int result = (int) tree.classifyInstance(instance);

        System.out.println("Nueva Clasificación " + PlayAttributeValues.newInstance(result));

        Classifier treeClassifier = new RandomTree();
        Evaluation treeEvaluation = new Evaluation(instances);
        int numFolds = 5;
        Random random = new Random(1);
        treeEvaluation.crossValidateModel(treeClassifier, instances, numFolds, random, new Object[] {});
        System.out.println("mfg--" + treeEvaluation.toSummaryString());

       

    }

}