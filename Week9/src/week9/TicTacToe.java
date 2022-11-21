package week9;
import java.util.Scanner;
public class TicTacToe {

    public static void main(String[] args) {
        int i, j;
        int player = 0;
        int turn = 0;
        String pilihan;
        String garis;
        boolean main = true;
        boolean menang = false;
        
        String TTT [] [] = {                        // ukurannya 3 x 3
                                {"1", "2", "3"},
                                {"4", "5", "6"},
                                {"7", "8", "9"},
                                };
        
        Scanner tekan = new Scanner (System.in);
        
        System.out.println("  TICTACTOE  ");
        System.out.println("=============");
        
        while (main) {
            boolean ada = false;
            
            // tampilan TICTACTOE
            for (i = 0; i < 3; i++){
                System.out.print("   ");
                for (j = 0; j < 3; j++){
                    System.out.print("|"+TTT[i][j]);
                    if (j == 2) {
                        System.out.print("|");
                    }
                }
                if (i < 2){
                    System.out.println("");
                   System.out.println("   -------"); 
                }
            }
            
            System.out.println("");
            System.out.println("");
            
            // penentuan hasil permainan
            if(menang == true){
                switch (player){
                    case 0 :
                        System.out.println("Player 1 WIN !!!");
                        return;
                    case 1 :
                        System.out.println("Player 2 WIN !!!");
                        return;
                }
            } else if (turn == 9){
                System.out.println("DRAW");
                return;
            }
            
            // penentuan player
            if (player == 0){
                System.out.print("Player 1 : ");
                pilihan = tekan.next();
                
                for (i = 0; i < 3; i++){
                    for (j = 0; j < 3; j++){
                        if(pilihan.equals(TTT[i][j])){
                            TTT[i][j] = "X";
                            ada = true;
                            player = 1;
                            turn++;
                        break;
                        }
                    }
                }
                
            } else {
                System.out.print("Player 2 : ");
                pilihan = tekan.next();
                
                for (i = 0; i < 3; i++){
                    for (j = 0; j < 3; j++){
                        if(pilihan.equals(TTT[i][j])){
                            TTT[i][j] = "O";
                            ada = true;
                            player = 0;
                            turn++;
                        break;
                        }
                    }
                }
            }
            
            System.out.println("");
            
            // peringatan jika nilai yang dipilih tidak ada
            if (ada == false){
                System.out.println("Pilihan anda tidak valid.");
                System.out.println("");
            }
            
            // kondisi menang
            for(i = 0; i < 8; i++){
                switch (i){
                    case 0 :
                        garis = TTT[0][0] + TTT[0][1] + TTT[0][2];
                        if ("XXX".equals(garis)){
                            player = 0;
                            menang = true;
                        } else if ("OOO".equals(garis)){
                            player = 1;
                            menang = true;
                        }
                        break;
                        
                    case 1 :
                        garis = TTT[1][0] + TTT[1][1] + TTT[1][2];
                        if ("XXX".equals(garis)){
                            player = 0;
                            menang = true;
                        } else if ("OOO".equals(garis)){
                            player = 1;
                            menang = true;
                        }
                        break;
                        
                    case 2 :
                        garis = TTT[2][0] + TTT[2][1] + TTT[2][2];
                        if ("XXX".equals(garis)){
                            player = 0;
                            menang = true;
                        } else if ("OOO".equals(garis)){
                            player = 1;
                            menang = true;
                        }
                        break;
                        
                    case 3 :
                        garis = TTT[0][0] + TTT[1][0] + TTT[2][0];
                        if ("XXX".equals(garis)){
                            player = 0;
                            menang = true;
                        } else if ("OOO".equals(garis)){
                            player = 1;
                            menang = true;
                        }
                        break;
                        
                    case 4 :
                        garis = TTT[0][1] + TTT[1][1] + TTT[2][1];
                        if ("XXX".equals(garis)){
                            player = 0;
                            menang = true;
                        } else if ("OOO".equals(garis)){
                            player = 1;
                            menang = true;
                        }
                        break;
                        
                    case 5 :
                        garis = TTT[0][2] + TTT[1][2] + TTT[2][2];
                        if ("XXX".equals(garis)){
                            player = 0;
                            menang = true;
                        } else if ("OOO".equals(garis)){
                            player = 1;
                            menang = true;
                        }
                        break;
                        
                    case 6 :
                        garis = TTT[0][0] + TTT[1][1] + TTT[2][2];
                        if ("XXX".equals(garis)){
                            player = 0;
                            menang = true;
                        } else if ("OOO".equals(garis)){
                            player = 1;
                            menang = true;
                        }
                        break;
                    case 7 :
                        garis = TTT[0][2] + TTT[1][1] + TTT[2][0];
                        if ("XXX".equals(garis)){
                            player = 0;
                            menang = true;
                        } else if ("OOO".equals(garis)){
                            player = 1;
                            menang = true;
                        }
                        break;
                }
            }
        }
    }
}