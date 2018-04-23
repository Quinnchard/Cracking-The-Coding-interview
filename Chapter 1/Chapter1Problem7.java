import java.util.Random;
import java.util.Scanner;

/*
 * CS 1290
 * Homework 1: Cracking the Coding Interview
 * Problem 1.7
 * @author Matthew S Montoya
 * 
 */
public class Chapter1Problem7 {
	private static Scanner input;

	public static void main(String[] args) {
		/*Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes,
		 * write a function to rotate the image by 90 degrees. Can you do this in place? 
		 */

		int[][] image = getImageBuildMatrix();
		int[][] rotatedImage = rotateImage(image);
		
		System.out.println("\n\nOriginal Image:");
		for(int i=0; i<image.length;i++) {
			System.out.println();
			for(int j=0; j<image[0].length;j++) {
				System.out.print(image[i][j]+"\t");
			}
		}
		
		System.out.println("\n\nRotated Image:");
		for(int i=0; i<rotatedImage.length;i++) {
			System.out.println();
			for(int j=0; j<rotatedImage[0].length;j++) {
				System.out.print(rotatedImage[i][j]+"\t");
			}
		}
	}


	/*INITIAL QUESTIONS && Assumptions
	 * 4 Bytes/pixel? I will assume an integer matrix
	 * 
	 */

	private static int[][] getImageBuildMatrix() {
		input = new Scanner(System.in);
		System.out.println("Enter the X pixel-value for the size of the image:");
		int x = input.nextInt();
		System.out.println("Enter the Y pixel-value for the size of the image:");
		int y = input.nextInt();
		int[][] imageMatrix = new int[x][y];
		
		int count = 0;
		for(int i=0; i<imageMatrix.length;i++) {
			for(int j=0; j<imageMatrix[i].length;j++) {
				imageMatrix[i][j] = count;
				count++;
			}
		}
		return imageMatrix;
	}

	private static int[][] rotateImage(int[][] image) {
		//create return matrix
		int[][] rotatedImage =new int[image[0].length][image.length];

		//loop and re-position pixels
		for(int i=0; i<image[0].length; i++){
			for(int j=image.length-1; j>=0; j--){
				rotatedImage[i][j] = image[j][i];
			}
		}
		return rotatedImage;
	}
}
