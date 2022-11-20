package heartdisease;


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



public class Classifications {

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
        J48 tree = new J48();
        String[] options = new String[1];
        options[0] = TREE_UNPRUNED_OPT;

        tree.setOptions(options);

        // genera el arbol de clasificación. 
        tree.buildClassifier(instances);

        System.out.println(tree);
        
///////////////////////////////////////////////////////////////////////////////////////////////////
        
        // un caso de prueba, se pone un nuevo objeto y basado en el árbol anterior
        // determina el valor de la funcion objetivo. 
        Instance instance = new DenseInstance(6);
        instance.setDataset(instances);
        instance.setValue(HeartAttributesIndex.AGE.getIndex(),52);
        instance.setValue(HeartAttributesIndex.SEX.getIndex(),"1");
        instance.setValue(HeartAttributesIndex.TRESTBPS.getIndex(),125);
        instance.setValue(HeartAttributesIndex.CHOL.getIndex(),212);
        instance.setValue(HeartAttributesIndex.FBS.getIndex(),"0");
        instance.setValue(HeartAttributesIndex.EXANG.getIndex(),"0");

        // resultado de la prueba
      int result = (int) tree.classifyInstance(instance);
 
      System.out.println("Nueva instancia 1: " + PlayAttributeValues.newInstance(result));

      Classifier treeClassifier = new J48();
      Evaluation treeEvaluation = new Evaluation(instances);
      int numFolds = 5;
      Random random = new Random(1);
      treeEvaluation.crossValidateModel(treeClassifier, instances, numFolds, random, new Object[] {});
      System.out.println("mfg--" + treeEvaluation.toSummaryString());


///////////////////////////////////////////////////////////////////////////////////////////////////      
      
      // un caso de prueba, se pone un nuevo objeto y basado en el árbol anterior
      // determina el valor de la funcion objetivo.       
      Instance instance2 = new DenseInstance(6);
      instance2.setDataset(instances);
      instance2.setValue(HeartAttributesIndex.AGE.getIndex(),58);
      instance2.setValue(HeartAttributesIndex.SEX.getIndex(),"0");
      instance2.setValue(HeartAttributesIndex.TRESTBPS.getIndex(),100);
      instance2.setValue(HeartAttributesIndex.CHOL.getIndex(),248);
      instance2.setValue(HeartAttributesIndex.FBS.getIndex(),"0");
      instance2.setValue(HeartAttributesIndex.EXANG.getIndex(),"0");

      // resultado de la prueba
    int result2 = (int) tree.classifyInstance(instance2);

       System.out.println("Nueva instancia 2: " + PlayAttributeValues.newInstance(result2));
   
        Classifier treeClassifier2 = new J48();
        Evaluation treeEvaluation2 = new Evaluation(instances);
        int numFolds2 = 5;
        Random random2 = new Random(1);
        treeEvaluation2.crossValidateModel(treeClassifier2, instances, numFolds2, random2, new Object[] {});
        System.out.println("mfg--" + treeEvaluation2.toSummaryString());
        
///////////////////////////////////////////////////////////////////////////////////////////////////
        
        // un caso de prueba, se pone un nuevo objeto y basado en el árbol anterior
        // determina el valor de la funcion objetivo.       
        Instance instance3 = new DenseInstance(6);
        instance3.setDataset(instances);
        instance3.setValue(HeartAttributesIndex.AGE.getIndex(),60);
        instance3.setValue(HeartAttributesIndex.SEX.getIndex(),"1");
        instance3.setValue(HeartAttributesIndex.TRESTBPS.getIndex(),117);
        instance3.setValue(HeartAttributesIndex.CHOL.getIndex(),230);
        instance3.setValue(HeartAttributesIndex.FBS.getIndex(),"1");
        instance3.setValue(HeartAttributesIndex.EXANG.getIndex(),"1");

        // resultado de la prueba
      int result3 = (int) tree.classifyInstance(instance3);

         System.out.println("Nueva instancia 3: " + PlayAttributeValues.newInstance(result3));
     
          Classifier treeClassifier3 = new J48();
          Evaluation treeEvaluation3 = new Evaluation(instances);
          int numFolds3 = 5;
          Random random3 = new Random(1);
          treeEvaluation3.crossValidateModel(treeClassifier3, instances, numFolds3, random3, new Object[] {});
          System.out.println("mfg--" + treeEvaluation3.toSummaryString());
          
  ///////////////////////////////////////////////////////////////////////////////////////////////////        


    }

}