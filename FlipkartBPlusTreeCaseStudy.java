public class FlipkartBPlusTreeCaseStudy {

    public static void main(String[] args) {

        int totalProducts = 10000000;
        int tuplesPerLeaf = 200;
        int averageResults = 2800;

        int leafPages = totalProducts / tuplesPerLeaf;
        int treeHeight = 3;

        int leafScanPages = averageResults / tuplesPerLeaf;

        int totalReads = treeHeight + leafScanPages;

        System.out.println("FLIPKART B+ TREE ANALYSIS");
        System.out.println("------------------------");

        System.out.println("Total Products = " + totalProducts);
        System.out.println("Leaf Pages = " + leafPages);
        System.out.println("Tree Height = " + treeHeight);

        System.out.println("Average Results = " + averageResults);

        System.out.println("Leaf Pages Traversed = " + leafScanPages);

        System.out.println("Total Page Reads = " + totalReads);

        System.out.println("\nConclusion:");
        System.out.println("B+ Tree is efficient for range queries.");
    }
}