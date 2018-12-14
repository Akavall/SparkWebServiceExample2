
To run tests:
```
mvn test
```

To build .jar file that contains dependencies
```
mvn package
```

Now run for inside the `target` directory:

```
java -jar SparkWebServiceExample2-1.0-SNAPSHOT-jar-with-dependencies.jar
```

Using Dockerfile:

Inside of `SparkWebServiceExample2` direcotry run:

```
docker build -t my_image .
```

and run with

```
docker run -t -p 8000:8000 my_image
```



