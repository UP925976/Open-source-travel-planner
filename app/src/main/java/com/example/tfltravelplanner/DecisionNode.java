package com.example.tfltravelplanner;

public class DecisionNode {

    int nodeID;
    int connectingStation1;
    int connectingStation2;
    int connectingStation3;
    int connectingStation4;
    int connectingStation5;
    int connectingStation6;
    int connectingStation7;
    int connectingStation8;
    int connectingStation9;

    String stationName;

    DecisionNode CSNode1;
    DecisionNode CSNode2;
    DecisionNode CSNode3;
    DecisionNode CSNode4;
    DecisionNode CSNode5;
    DecisionNode CSNode6;
    DecisionNode CSNode7;
    DecisionNode CSNode8;
    DecisionNode CSNode9;

    int line1;
    int line2;
    int line3;
    int line4;
    int line5;
    int line6;

    DecisionNode linkedNode;

    public DecisionNode() {}

    public DecisionNode getLinkedNode() {return linkedNode;}
    public void setLinkedNode(DecisionNode linkedNode) {this.linkedNode = linkedNode;}

    public int getNodeID() {return nodeID;}
    public void setNodeID(int nodeID) {this.nodeID = nodeID;}
    public int getConnectingStation1() {return connectingStation1;}
    public void setConnectingStation1(int connectingStation1) {this.connectingStation1 = connectingStation1; }
    public int getConnectingStation2() {return connectingStation2;}
    public void setConnectingStation2(int connectingStation2) {this.connectingStation2 = connectingStation2;}
    public int getConnectingStation3() {return connectingStation3;}
    public void setConnectingStation3(int connectingStation3) {this.connectingStation3 = connectingStation3;}
    public int getConnectingStation4() {return connectingStation4;}
    public void setConnectingStation4(int connectingStation4) {this.connectingStation4 = connectingStation4;}
    public int getConnectingStation5() {return connectingStation5;}
    public void setConnectingStation5(int connectingStation5) {this.connectingStation5 = connectingStation5;}
    public int getConnectingStation6() {return connectingStation6;}
    public void setConnectingStation6(int connectingStation6) {this.connectingStation6 = connectingStation6;}
    public int getConnectingStation7() {return connectingStation7;}
    public void setConnectingStation7(int connectingStation7) {this.connectingStation7 = connectingStation7;}
    public int getConnectingStation8() {return connectingStation8;}
    public void setConnectingStation8(int connectingStation8) {this.connectingStation8 = connectingStation8;}
    public int getConnectingStation9() {return connectingStation9;}
    public void setConnectingStation9(int connectingStation9) {this.connectingStation9 = connectingStation9;}

    public DecisionNode getCSNode1() {return CSNode1;}
    public void setCSNode1(DecisionNode CSNode1) {this.CSNode1 = CSNode1;}
    public DecisionNode getCSNode2() {return CSNode2;}
    public void setCSNode2(DecisionNode CSNode2) {this.CSNode2 = CSNode2;}
    public DecisionNode getCSNode3() {return CSNode3;}
    public void setCSNode3(DecisionNode CSNode3) {this.CSNode3 = CSNode3;}
    public DecisionNode getCSNode4() {return CSNode4;}
    public void setCSNode4(DecisionNode CSNode4) {this.CSNode4 = CSNode4;}
    public DecisionNode getCSNode5() {return CSNode5;}
    public void setCSNode5(DecisionNode CSNode5) {this.CSNode5 = CSNode5;}
    public DecisionNode getCSNode6() {return CSNode6;}
    public void setCSNode6(DecisionNode CSNode6) {this.CSNode6 = CSNode6;}
    public DecisionNode getCSNode7() {return CSNode7;}
    public void setCSNode7(DecisionNode CSNode7) {this.CSNode7 = CSNode7;}
    public DecisionNode getCSNode8() {return CSNode8;}
    public void setCSNode8(DecisionNode CSNode8) {this.CSNode8 = CSNode8;}
    public DecisionNode getCSNode9() {return CSNode9;}
    public void setCSNode9(DecisionNode CSNode9) {this.CSNode9 = CSNode9;}

    public int getLine1() {return line1;}
    public void setLine1(int line1) {this.line1 = line1;}
    public int getLine2() {return line2;}
    public void setLine2(int line2) {this.line2 = line2;}
    public int getLine3() {return line3;}
    public void setLine3(int line3) {this.line3 = line3;}
    public int getLine4() {return line4;}
    public void setLine4(int line4) {this.line4 = line4;}
    public int getLine5() {return line5;}
    public void setLine5(int line5) {this.line5 = line5;}
    public int getLine6() {return line6;}
    public void setLine6(int line6) {this.line6 = line6;}

    public String getStationName() {return stationName;}
    public void setStationName(String stationName) {this.stationName = stationName; }

}

