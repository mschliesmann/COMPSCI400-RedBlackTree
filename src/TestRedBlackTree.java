// --== CS400 File Header Information ==--
// Name: <Marlena Schliesmann>
// Email: <mschliesmann@wisc.edu>
// Team: <AP>
// TA: <April>
// Lecturer: <Gary Dahl>
// Notes to Grader: NONE

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestRedBlackTree {

	/**
	 * Tests the correctness of enforceRBTreePropertiesAfterInsert's
	 * case 3 when a new tree is created
     */
   @Test
	 public void test1() {
		 RedBlackTree<Integer> tree = new RedBlackTree<Integer>();
		 tree.insert(10);
		 tree.insert(5);
		 tree.insert(15);
		 tree.insert(3);

		 boolean expectedTrue = true;
		 boolean expectedFalse = false;
		 assertEquals(expectedTrue, tree.root.isBlack);
		 assertEquals(expectedTrue, tree.root.leftChild.isBlack);
		 assertEquals(expectedTrue, tree.root.rightChild.isBlack);
		 assertEquals(expectedFalse, tree.root.leftChild.leftChild.isBlack);
	 }
	 
	 /**
	  * Tests the correctness of enforceRBTreePropertiesAfterInsert's
	  * case 1
	  */
	@Test
	 public void test2() {
		 RedBlackTree<Integer> tree = new RedBlackTree<Integer>();
		 tree.insert(10);
		 tree.insert(5);
		 tree.insert(15);
		 tree.insert(18);
		 tree.insert(20);
		 
		 boolean expectedTrue = true;
		 boolean expectedFalse = false;
		 assertEquals(expectedTrue, tree.root.isBlack);
		 assertEquals(expectedTrue, tree.root.leftChild.isBlack);
		 assertEquals(expectedTrue, tree.root.rightChild.isBlack);
		 assertEquals(expectedFalse, tree.root.rightChild.leftChild.isBlack);
		 assertEquals(expectedFalse, tree.root.rightChild.rightChild.isBlack);
		 
	 }
	 
	 /**
	  * Tests the correctness of enforceRBTreePropertiesAfterInsert's
	  * case 3 when implemented in a subtree
	  */
	@Test
	 public void test3() {
		 RedBlackTree<Integer> tree = new RedBlackTree<Integer>();
		 tree.insert(10);
		 tree.insert(5);
		 tree.insert(15);
		 tree.insert(18);
		 tree.insert(20);
		 tree.insert(22);
		 
		 boolean expectedTrue = true;
		 boolean expectedFalse = false;
		 assertEquals(expectedTrue, tree.root.isBlack);
		 assertEquals(expectedTrue, tree.root.leftChild.isBlack);
		 assertEquals(expectedFalse, tree.root.rightChild.isBlack);
		 assertEquals(expectedTrue, tree.root.rightChild.leftChild.isBlack);
		 assertEquals(expectedTrue, tree.root.rightChild.rightChild.isBlack);
		 assertEquals(expectedFalse, tree.root.rightChild.rightChild.rightChild.isBlack);
	 }
	 
	 /**
	  * Tests the correctness of enforceRBTreePropertiesAfterInsert's
	  * case 2 when implemented in a subtree
	  */
	@Test
	 public void test4() {
		 RedBlackTree<Integer> tree = new RedBlackTree<Integer>();
		 tree.insert(30);
		 tree.insert(40);
		 tree.insert(10);
		 tree.insert(5);
		 tree.insert(20);
		 tree.insert(15);
		 tree.insert(22);
		 tree.insert(25);
		 
		 boolean expectedTrue = true;
		 boolean expectedFalse = false;
		 assertEquals(expectedTrue, tree.root.isBlack);
		 assertEquals(expectedFalse, tree.root.leftChild.isBlack);
		 assertEquals(expectedFalse, tree.root.rightChild.isBlack);
		 assertEquals(expectedTrue, tree.root.leftChild.leftChild.isBlack);
		 assertEquals(expectedTrue, tree.root.leftChild.rightChild.isBlack);
		 assertEquals(expectedTrue, tree.root.rightChild.leftChild.isBlack);
		 assertEquals(expectedTrue, tree.root.rightChild.rightChild.isBlack);
		 assertEquals(expectedFalse, tree.root.rightChild.leftChild.rightChild.isBlack);
		 
	 }
	 
}
