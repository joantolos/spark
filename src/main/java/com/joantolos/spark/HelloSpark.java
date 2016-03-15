package com.joantolos.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.VoidFunction;

import java.util.Arrays;
import java.util.List;

public class HelloSpark {

    public static void main(String[] args) {

        SparkConf sparkConf = new SparkConf().setAppName("HelloSpark").setMaster("local");
        JavaSparkContext ctx = new JavaSparkContext(sparkConf);
        String[] arr = new String[] { "John", "Paul", "George", "Ringo" };
        List<String> inputList = Arrays.asList(arr);
        JavaRDD<String> inputRDD = ctx.parallelize(inputList);
        inputRDD.foreach(new VoidFunction<String>() {

            public void call(String input) throws Exception {
                System.out.println(input);

            }
        });

    }
}
