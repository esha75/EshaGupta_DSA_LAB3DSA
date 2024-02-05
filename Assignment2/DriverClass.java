package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class DriverClass {
    static ArrayList<Integer> nodelist = new ArrayList<>();
    public static void main(String[] args) {
        Node root=null; //BINARY SEARCH TREE IS USED FOR IMPLEMENTATION
        Node newnode;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Numbers of Nodes:");
        int size=sc.nextInt();
        int i;
        int data;
        for (i=0; i<size; i++) {
            System.out.println("Enter Data for Node(no duplicates)"+ i+":");
            data=sc.nextInt();
            newnode =new Node(data);
            if(root==null){
                root=newnode;
            }
            else{
                insert(root,newnode);
            }
        }

        inorder(root);
        System.out.println(nodelist);
        System.out.println("Enter The Sum To Find Pair Of Nodes:");
        int sum =sc.nextInt();

        int n1;
        int n2;
        int flag=0;
        int j;
        for ( j=0;j<nodelist.size();j++){
            n1=nodelist.get(j);
            n2=sum-n1;

                if (nodelist.contains(n2) && n2!=n1){
                    System.out.println("Pair Found [ "+n1+","+n2+"]");
                    flag=1;
                    break;
                }

        }
        if (flag==0){
            System.out.println("Pair Not Found");
        }

    }
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
			nodelist.add(root.data);
			inorder(root.right);
        }
    }

    public static void insert(Node root , Node newnode){
        if (newnode.data>root.data){
            if (root.right==null){
                root.right = newnode;
            }
            else{
                insert(root.right,newnode);
            }
        }
        else{
            if (root.left==null){
                root.left = newnode;
            }
            else{
                insert(root.left,newnode);
            }

        }
    }
}
