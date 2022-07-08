package com.example.tfltravelplanner;

import static com.example.tfltravelplanner.DecisionMapTest.stations;
import static java.lang.Integer.valueOf;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class DecisionMap extends AppCompatActivity {

    com.example.tfltravelplanner.DecisionNode head;
    com.example.tfltravelplanner.DecisionNode tail;
    com.example.tfltravelplanner.DecisionNode[] trains = new com.example.tfltravelplanner.DecisionNode[413];


    public DecisionMap() throws FileNotFoundException {
        Scanner scanner = new Scanner(com.example.tfltravelplanner.MainActivity.getCSVResources().openRawResource(R.raw.london_tube_lines));

        buildUnorderedList(scanner);
        buildOrderedMap();
        //unorderedMap = null;
    }

    private void append(com.example.tfltravelplanner.DecisionNode newNode) {

        if (isEmpty()) {
            this.head = newNode;
            this.tail = newNode;
            this.tail.setLinkedNode(null);

            return;
        }

        this.tail.setLinkedNode(newNode);
        this.tail = newNode;
    }


    public Scanner connectDataSet(String pathName) throws FileNotFoundException {
        Scanner scanner = new Scanner(getResources().openRawResource(R.raw.london_tube_lines));
        return new Scanner(String.valueOf(scanner));
    }
    static com.example.tfltravelplanner.DecisionNode node ;
    public void buildUnorderedList(Scanner dataSet) {

        dataSet.useDelimiter(",");

        do {
            String line = dataSet.nextLine();
            node = buildNode(line);
            stations.add(DecisionMap.node.getStationName());
            append(node);
        } while (dataSet.hasNext());
        dataSet.close();

    }

    private void buildOrderedMap() {

        if (head == null) {throw new com.example.tfltravelplanner.CustomException("Node " + head.nodeID + ": No Linked Node");}

        com.example.tfltravelplanner.DecisionNode nodeLinker = head;

        while (nodeLinker != null) {

            int getCSNode1 = nodeLinker.getConnectingStation1();
            int getCSNode2 = nodeLinker.getConnectingStation2();
            int getCSNode3 = nodeLinker.getConnectingStation3();
            int getCSNode4 = nodeLinker.getConnectingStation4();
            int getCSNode5 = nodeLinker.getConnectingStation5();
            int getCSNode6 = nodeLinker.getConnectingStation6();
            int getCSNode7 = nodeLinker.getConnectingStation7();
            int getCSNode8 = nodeLinker.getConnectingStation8();
            int getCSNode9 = nodeLinker.getConnectingStation9();

            com.example.tfltravelplanner.DecisionNode Node1 = nodeFetch(getCSNode1);
            com.example.tfltravelplanner.DecisionNode Node2 = nodeFetch(getCSNode2);
            com.example.tfltravelplanner.DecisionNode Node3 = nodeFetch(getCSNode3);
            com.example.tfltravelplanner.DecisionNode Node4 = nodeFetch(getCSNode4);
            com.example.tfltravelplanner.DecisionNode Node5 = nodeFetch(getCSNode5);
            com.example.tfltravelplanner.DecisionNode Node6 = nodeFetch(getCSNode6);
            com.example.tfltravelplanner.DecisionNode Node7 = nodeFetch(getCSNode7);
            com.example.tfltravelplanner.DecisionNode Node8 = nodeFetch(getCSNode8);
            com.example.tfltravelplanner.DecisionNode Node9 = nodeFetch(getCSNode9);

            nodeLinker.setCSNode1(Node1);
            nodeLinker.setCSNode2(Node2);
            nodeLinker.setCSNode3(Node3);
            nodeLinker.setCSNode4(Node4);
            nodeLinker.setCSNode5(Node5);
            nodeLinker.setCSNode6(Node6);
            nodeLinker.setCSNode7(Node7);
            nodeLinker.setCSNode8(Node8);
            nodeLinker.setCSNode9(Node9);

            nodeLinker = nodeLinker.getLinkedNode();

        }

        cleanup();

    }

    private void cleanup(){
        if (head == null) {
            throw new com.example.tfltravelplanner.CustomException("Node " + head.nodeID + ": No Linked Node");
        }

        com.example.tfltravelplanner.DecisionNode currentNode = head;
        com.example.tfltravelplanner.DecisionNode nextNode = head.getLinkedNode();

        while (nextNode != null) {

            currentNode.setLinkedNode(null);

            currentNode = nextNode;
            nextNode = currentNode.getLinkedNode();
        }
    }

    private com.example.tfltravelplanner.DecisionNode buildNode(String line) {
        String[] stringArray = line.split(",");
        com.example.tfltravelplanner.DecisionNode n = new com.example.tfltravelplanner.DecisionNode();

        n.setNodeID(valueOf(stringArray[0]));
        n.setStationName(stringArray[1]);

        n.setConnectingStation1(valueOf(stringArray[8]));
        n.setConnectingStation2(valueOf(stringArray[9]));
        n.setConnectingStation3(valueOf(stringArray[10]));
        n.setConnectingStation4(valueOf(stringArray[11]));
        n.setConnectingStation5(valueOf(stringArray[12]));
        n.setConnectingStation6(valueOf(stringArray[13]));
        n.setConnectingStation7(valueOf(stringArray[14]));
        n.setConnectingStation8(valueOf(stringArray[15]));
        n.setConnectingStation9(valueOf(stringArray[16]));

        n.setLine1(valueOf(stringArray[2]));
        n.setLine2(valueOf(stringArray[3]));
        n.setLine3(valueOf(stringArray[4]));
        n.setLine4(valueOf(stringArray[5]));
        n.setLine5(valueOf(stringArray[6]));
        n.setLine6(valueOf(stringArray[7]));

        return n;
    }

    public com.example.tfltravelplanner.DecisionNode entryPoint() {
        return head;
    }

    private com.example.tfltravelplanner.DecisionNode nodeFetch(int nodeID) {

        com.example.tfltravelplanner.DecisionNode nodeLinker = head;

        while (nodeLinker != null) {
            if(nodeLinker.getNodeID() == nodeID){ break ;}
            nodeLinker = nodeLinker.getLinkedNode();
        }

        return nodeLinker;
    }


    private boolean isEmpty() {
        return this.head == null;
    }
}