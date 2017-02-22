default:
	javac -Xlint:unchecked *.java

docs:
	javadoc -private -html5 *.java -d Docs

clean:
	rm -f *.class

cleandocs:
	rm -rf Docs
