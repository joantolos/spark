# Spark POC

Simple proof of concept for using Spark with Java.

## About Spark

Apache Spark is a fast and general engine for large-scale data processing.

### Using the POC

This program runs in local mode, you don't need a cluster to run this program.

While creating the Spark configuration, the master node is set as local to make this a stand alone program.

    SparkConf sparkConf = new SparkConf().setAppName("HelloWorld").setMaster("local");

**RDD** is an immutable distributed collection of objects. Each **RDD** is split into multiple partitions, which may be computed on different nodes of the cluster. In cluster mode execution these spark specific objects play a significant role in the faster & distributed processing of dataset.

In the below code snippet a normal java collection is converted into **JavaRDD**.

    JavaRDD<String> inputRDD = ctx.parallelize(inputList);

The first phase of a spark program is this conversion, which brings distributed nature to the input dataset.

Spark supports [functional programming](https://en.wikipedia.org/wiki/Functional_programming). In the below code snippet a function **call** is passed to the input dataset. For each set the call method is applied. We can write transformation/logic inside the call method.

    inputRDD.foreach(new VoidFunction<String>() {
        public void call(String input) throws Exception {
            System.out.println(input);
        }
    });

**VoidFunction** is an inbuilt java class comes with spark java package. A list of such classes are available in spark java package. These classes brings functional programming nature to java programming language. From JDK8 onwards java supports functional programming by default.

The aforementioned classes can be used along with JDK 6 & 7. Spark utilises the anonymous class feature of java for bringing the functional nature.

## Credits and fonts

* http://semanticeyes.blogspot.com/2015/08/apache-spark-getting-started-with-java.html