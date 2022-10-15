package array;

import java.awt.FontFormatException;
import java.security.PublicKey;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.w3c.dom.ls.LSOutput;

public class MultiDimArray {

	public static void main(String[] args) {
		int[][] nums = new int[3][3];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the value for rows and columns");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				nums[i][j] = scn.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println("");
		}
		int twoDArray[][] = { { 0, 1, 2 }, { 1, 2, 3 }, { 2, 3, 4 } };

		for (int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++) {
				System.out.print(twoDArray[i][j]);
			}
			System.out.println();
		}

	}
}