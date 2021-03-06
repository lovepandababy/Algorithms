package org.Algorithm.InterviewAlgorithm.NowCoder;

/**
 * Created by Ellen on 2017/8/3.
 * 在二维平面上，有两个正方形，请找出一条直线，能够将这两个正方形对半分。假定正方形的上下两条边与x轴平行。
 * 给定两个vecotrA和B，分别为两个正方形的四个顶点。请返回一个vector，代表所求的平分直线的斜率和截距，保证斜率存在。
 */
public class Bipartition {
	public static double[] getBipartition(Point[] A, Point[] B) {
		// write code here
		double k, x;
		double p1y = (A[1].y + A[0].y + A[2].y + A[3].y) / 4.0;
		double p1x = (A[2].x + A[1].x + A[0].x + A[3].x) / 4.0;
		double p2y = (B[1].y + B[0].y + B[3].y + B[2].y) / 4.0;
		double p2x = (B[2].x + B[1].x + B[3].x + B[0].x) / 4.0;
		k = (p1y - p2y) / (p1x - p2x);
		x = p1y - k * p1x;
		return new double[]{k, x};
	}

	public static void main(String[] args) {
		Point[] A = new Point[]{new Point(0, 0), new Point(0, 1), new Point(1, 1), new Point(1, 0)};
		Point[] B = new Point[]{new Point(1, 0), new Point(1, 1), new Point(2, 0), new Point(2, 1)};
		double[] bipartition = getBipartition(A, B);
		for (double v : bipartition) {
			System.out.println(v);
		}
	}

	public static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		public Point() {
			this.x = 0;
			this.y = 0;
		}


		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;

			Point point = (Point) o;

			if (x != point.x) return false;
			return y == point.y;
		}

		@Override
		public int hashCode() {
			int result = x;
			result = 31 * result + y;
			return result;
		}
	}
}


