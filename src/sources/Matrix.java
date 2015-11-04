package sources;

import java.util.Random;

public class Matrix {
	
	public Double[][] matrix;
	public Integer xSize;
	public Integer ySize;
	
	public Matrix(Integer x, Integer y){
		xSize=x;
		ySize=y;
		matrix = new Double[x][y];
	}

	public Double[][] getMatrix() {
		return matrix;
	}
	
	public Double getValue(Integer x, Integer y){
		return this.matrix[x][y];
	}

	public void setValue(Integer x, Integer y, Double value) {
		this.matrix[x][y] = value;
	}
	
	public Double[][] makeRandomMatrix(Integer x, Integer y){
		for(int i=0; i<x; i++)
			for(int j=0; j<y; j++)
				matrix[i][j]=5.0;//new Random().nextDouble();
		return matrix;
	}
	
	public void multiplyByMatrix(Matrix mat){
        int xMat = mat.xSize;
        int yMat = mat.ySize;
        if (this.ySize != xMat) throw new RuntimeException("Illegal matrix dimensions for multiplication!");
        Double[][] result = new Double[this.xSize][yMat];
        for (int i = 0; i < this.xSize; i++){
            for (int j = 0; j < yMat; j++){
            	result[i][j]=0.0;
                for (int k = 0; k < this.ySize; k++){
                    result[i][j] += this.matrix[i][k] * mat.matrix[k][j];
        		}
        	}
        }
        matrix=result;
	}
	
	public String toString(){ 
		 for (int i=0; i < matrix.length; i++) { 
		    for (int j=0; j < matrix[i].length; j++) 
		       if (j == (matrix[i].length - 1)) 
		              System.out.print(matrix[i][j]); 
		       else System.out.print(matrix[i][j] + "\t"); 
		     System.out.println(); 
		 }
		return null;
	 }
}
