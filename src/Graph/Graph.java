package Graph;

import javafx.application.Application;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertexList;
    private ArrayList<Edge> edgeList;
    private boolean isOriented;
    private boolean isWeighed;

    public Graph(){
        isOriented = false;
        isWeighed = false;
        vertexList = new ArrayList<Vertex>();
        edgeList = new ArrayList<Edge>();
    }

    public Graph(Graph other){
        this.isWeighed = other.isWeighed;
        this.isOriented = other.isOriented;
        this.vertexList = new ArrayList<Vertex>(other.vertexList);
        this.edgeList = new ArrayList<Edge>(other.edgeList);
    }

    public Graph(String filename){

    }



}
