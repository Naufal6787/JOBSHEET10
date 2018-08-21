/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet10;

public class KelasMoklet{
    
        int kelas [] []= {{10},{11},{12}};
        String Jurusan [][] = {{"RPL"},{"TKJ"}};
        public void tampil(String n){
	System.out.println("Siswa Smk Telkom");
}
public void JurusanKelas (int n){
       for (int i = 0; i< 1; i++){
	for (int j = 0; j < 1; j++){
	System.out.println(kelas [i][j]+Jurusan[1][j]);
	}
	}
	}
    public static void main (String[]args){
	KelasMoklet siswa = new KelasMoklet();
	siswa.tampil(null);
	siswa.JurusanKelas(0);
    }
}
