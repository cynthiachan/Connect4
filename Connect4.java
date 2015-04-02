/*Matthew Kennedy
 * Juliet Chuang
 * Cynthia Chan
 * CS112
 * Problem Set 9
 * This is the class for the Connect4 in Connect 4.
 * It looks at possible moves and generates a tree that will be used to decide the best move to make.
 * 
 * 
 * 
 * */

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
import java.util.EventObject;
import java.awt.EventQueue;
import javax.swing.*; 
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;

public class Connect4 extends JFrame{
    
    private static ImageIcon icon = new ImageIcon("res/cross.gif");
    
    private static void compTurn(Player18 p, JButton [][] spot) {
        int  col = p.chooseMove();
        for (int row = 7; row >= 0; row--) {
            if(spot[row][col].getBackground() != Color.red && spot[row][col].getBackground() != Color.blue) {
                spot[row][col].setBackground(Color.blue);
                spot[row][col].setOpaque(true);
                spot[row][col].setBorderPainted(false);
                row = -1;
            }
        }
    }
    
    
    private static void playerOne(Player18 p, JButton [][] spot, int col, JRadioButton pvp, boolean p1t) {
        //Edit the board, put in -1 and turn it blue r
        if (!pvp.isSelected() || (pvp.isSelected() && p1t == true)){//p1t means player 1 turn
            p.board = p.makeMove(col, 1);
            p1t = !p1t;
            for (int row = 7; row >= 0; row--) {
                
                if(spot[row][col].getBackground() != Color.red && spot[row][col].getBackground() != Color.blue) {
                    spot[row][col].setBackground(Color.red);
                    spot[row][col].setOpaque(true);
                    spot[row][col].setBorderPainted(false);
                    row = -1;
                }
            }
        }
        else if (pvp.isSelected() && p1t == false) {
            p.board = p.makeMove(col, 10); 
            p1t = !p1t;
            for (int row = 7; row >= 0; row--) {
                
                if(spot[row][col].getBackground() != Color.red && spot[row][col].getBackground() != Color.blue) {
                    spot[row][col].setBackground(Color.blue);
                    spot[row][col].setOpaque(true);
                    spot[row][col].setBorderPainted(false);
                    row = -1;
                }
            }
        }
        if (!pvp.isSelected()){
            change(p, spot, pvp);
        }
        
    }
    
    
    private static void gray (JButton [][] button, Player18 p) {
        for (int row = 0; row < 8; row ++) {
            for (int col = 0; col < 8; col++) {
                p.board[row][col] = 0;
                button[row][col].setBackground(Color.lightGray);
                button[row][col].setOpaque(true);
                button[row][col].setBorderPainted(false);
            }
        }
    }
    
    private static void change (Player18 p, JButton [][] spot, JRadioButton pvp) {
        if (!pvp.isSelected()) {
            compTurn(p, spot);
        }
    }
    
    private static boolean gameOver (Player18 p) {
        if (p.isWin() || p.isWinHum()) {
            return true;
        }
        
        boolean row = true;
        
        for (int col = 0; col < 8; col++) {
            if(p.board[0][col] == 0) {
                row = false;
            }
        }
        return row;
        
    }
    
    
    public static void main (String []args) {
        
        //create icons
        JButton spot1= new JButton(icon);
        JButton spot2= new JButton(icon);
        JButton spot3= new JButton(icon);      
        JButton spot4= new JButton(icon);
        JButton spot5= new JButton(icon);
        JButton spot6= new JButton(icon);
        JButton spot7= new JButton(icon);
        JButton spot8= new JButton(icon);
        JButton spot9= new JButton(icon);
        JButton spot10= new JButton(icon);
        
        JButton spot11= new JButton(icon);
        JButton spot12= new JButton(icon);
        JButton spot13= new JButton(icon);      
        JButton spot14= new JButton(icon);
        JButton spot15= new JButton(icon);
        JButton spot16= new JButton(icon);
        JButton spot17= new JButton(icon);
        JButton spot18= new JButton(icon);
        JButton spot19= new JButton(icon);
        JButton spot20= new JButton(icon);
        
        JButton spot21= new JButton(icon);
        JButton spot22= new JButton(icon);
        JButton spot23= new JButton(icon);      
        JButton spot24= new JButton(icon);
        JButton spot25= new JButton(icon);
        JButton spot26= new JButton(icon);
        JButton spot27= new JButton(icon);
        JButton spot28= new JButton(icon);
        JButton spot29= new JButton(icon);
        JButton spot30= new JButton(icon);
        
        JButton spot31= new JButton(icon);
        JButton spot32= new JButton(icon);
        JButton spot33= new JButton(icon);      
        JButton spot34= new JButton(icon);
        JButton spot35= new JButton(icon);
        JButton spot36= new JButton(icon);
        JButton spot37= new JButton(icon);
        JButton spot38= new JButton(icon);
        JButton spot39= new JButton(icon);
        JButton spot40= new JButton(icon);
        
        JButton spot41= new JButton(icon);
        JButton spot42= new JButton(icon);
        JButton spot43= new JButton(icon);      
        JButton spot44= new JButton(icon);
        JButton spot45= new JButton(icon);
        JButton spot46= new JButton(icon);
        JButton spot47= new JButton(icon);
        JButton spot48= new JButton(icon);
        JButton spot49= new JButton(icon);
        JButton spot50= new JButton(icon);
        
        JButton spot51= new JButton(icon);
        JButton spot52= new JButton(icon);
        JButton spot53= new JButton(icon);      
        JButton spot54= new JButton(icon);
        JButton spot55= new JButton(icon);
        JButton spot56= new JButton(icon);
        JButton spot57= new JButton(icon);
        JButton spot58= new JButton(icon);
        JButton spot59= new JButton(icon);
        JButton spot60= new JButton(icon);
        
        JButton spot61= new JButton(icon);
        JButton spot62= new JButton(icon);
        JButton spot63= new JButton(icon);      
        JButton spot64= new JButton(icon);
        
        //make array of buttons
        JButton [] [] spot= {{spot1,spot2,spot3,spot4,spot5,spot6,spot7,spot8},
            {spot9,spot10,spot11,spot12,spot13,spot14,spot15,spot16},
            {spot17,spot18,spot19,spot20,spot21,spot22,spot23,spot24},
            {spot25,spot26,spot27,spot28,spot29,spot30,spot31,spot32},
            {spot33,spot34,spot35,spot36,spot37,spot38,spot39,spot40},
            {spot41,spot42,spot43,spot44,spot45,spot46,spot47,spot48},
            {spot49,spot50,spot51,spot52,spot53,spot54,spot55,spot56},
            {spot57,spot58,spot59,spot60,spot61,spot62,spot63,spot64},
        };
        
        Player18 p = new Player18();
        gray(spot, p);
        
        
        //set sizes
        JBox.setSize(spot1,70,70);
        JBox.setSize(spot2,70,70);
        JBox.setSize(spot3,70,70);
        JBox.setSize(spot4,70,70);
        JBox.setSize(spot5,70,70);
        JBox.setSize(spot6,70,70);
        JBox.setSize(spot7,70,70);
        JBox.setSize(spot8,70,70);
        JBox.setSize(spot9,70,70);
        JBox.setSize(spot10,70,70);
        
        JBox.setSize(spot11,70,70);
        JBox.setSize(spot12,70,70);
        JBox.setSize(spot13,70,70);
        JBox.setSize(spot14,70,70);
        JBox.setSize(spot15,70,70);
        JBox.setSize(spot16,70,70);
        JBox.setSize(spot17,70,70);
        JBox.setSize(spot18,70,70);
        JBox.setSize(spot19,70,70);
        JBox.setSize(spot20,70,70);
        
        JBox.setSize(spot21,70,70);
        JBox.setSize(spot22,70,70);
        JBox.setSize(spot23,70,70);
        JBox.setSize(spot24,70,70);
        JBox.setSize(spot25,70,70);
        JBox.setSize(spot26,70,70);
        JBox.setSize(spot27,70,70);
        JBox.setSize(spot28,70,70);
        JBox.setSize(spot29,70,70);
        JBox.setSize(spot30,70,70);
        
        JBox.setSize(spot31,70,70);
        JBox.setSize(spot32,70,70);
        JBox.setSize(spot33,70,70);
        JBox.setSize(spot34,70,70);
        JBox.setSize(spot35,70,70);
        JBox.setSize(spot36,70,70);
        JBox.setSize(spot37,70,70);
        JBox.setSize(spot38,70,70);
        JBox.setSize(spot39,70,70);
        JBox.setSize(spot40,70,70);
        
        JBox.setSize(spot41,70,70);
        JBox.setSize(spot42,70,70);
        JBox.setSize(spot43,70,70);
        JBox.setSize(spot44,70,70);
        JBox.setSize(spot45,70,70);
        JBox.setSize(spot46,70,70);
        JBox.setSize(spot47,70,70);
        JBox.setSize(spot48,70,70);
        JBox.setSize(spot49,70,70);
        JBox.setSize(spot50,70,70);
        
        JBox.setSize(spot51,70,70);
        JBox.setSize(spot52,70,70);
        JBox.setSize(spot53,70,70);
        JBox.setSize(spot54,70,70);
        JBox.setSize(spot55,70,70);
        JBox.setSize(spot56,70,70);
        JBox.setSize(spot57,70,70);
        JBox.setSize(spot58,70,70);
        JBox.setSize(spot59,70,70);
        JBox.setSize(spot60,70,70);
        
        JBox.setSize(spot61,70,70);
        JBox.setSize(spot62,70,70);
        JBox.setSize(spot63,70,70);
        JBox.setSize(spot64,70,70);
        
        
        

        boolean p1t = true; //player 1 turn
        
        JFrame frame=new JFrame("Connect Four");
        frame.setSize(700,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton [][] board = new JButton[8][8];
        // board = createBoard(board);
        
        int[][] Board = new int[8][8];
        
        //set font sizes
        Font font1 = new Font("Times New Roman", Font.BOLD, 30);
        
        //labels
        JLabel title = new JLabel("Connect Four");
        title.setFont(font1);
        
        //spots
        JButton Quit = new JButton("Quit");
        Quit.setEnabled(true);
        JButton Reset = new JButton("Reset");
        Reset.setEnabled(true);   
        
        
        JRadioButton pvp = new JRadioButton("2 Players");
        JSlider diff = new JSlider (SwingConstants.HORIZONTAL, 1, 3, 2);
        diff.setMajorTickSpacing(1);
        diff.setPaintTicks(true);
        diff.setPaintLabels(true);
        JLabel diffic = new JLabel ("Difficulty");
        
        //body
        JBox body=
            JBox.vbox(JBox.vspace(10),
                      JBox.hbox(JBox.hglue(), title, JBox.hglue()),
                      JBox.vspace(10),
                      JBox.hbox(JBox.hglue(), spot1, JBox.hspace(1), spot2, JBox.hspace(1), spot3, JBox.hspace(1), spot4, JBox.hspace(1), spot5, JBox.hspace(1), spot6, JBox.hspace(1), spot7, JBox.hspace(1), spot8, JBox.hglue()),
                      JBox.vspace(1),
                      JBox.hbox(JBox.hglue(), spot9, JBox.hspace(1), spot10, JBox.hspace(1), spot11, JBox.hspace(1), spot12, JBox.hspace(1), spot13, JBox.hspace(1), spot14, JBox.hspace(1), spot15, JBox.hspace(1), spot16, JBox.hglue()),
                      JBox.vspace(1),
                      JBox.hbox(JBox.hglue(), spot17, JBox.hspace(1), spot18, JBox.hspace(1), spot19, JBox.hspace(1), spot20, JBox.hspace(1), spot21, JBox.hspace(1), spot22, JBox.hspace(1), spot23, JBox.hspace(1), spot24, JBox.hglue()),
                      JBox.vspace(1),
                      JBox.hbox(JBox.hglue(), spot25, JBox.hspace(1), spot26, JBox.hspace(1), spot27, JBox.hspace(1), spot28, JBox.hspace(1), spot29, JBox.hspace(1), spot30, JBox.hspace(1), spot31, JBox.hspace(1), spot32, JBox.hglue()),
                      JBox.vspace(1),
                      JBox.hbox(JBox.hglue(), spot33, JBox.hspace(1), spot34, JBox.hspace(1), spot35, JBox.hspace(1), spot36, JBox.hspace(1), spot37, JBox.hspace(1), spot38, JBox.hspace(1), spot39, JBox.hspace(1), spot40, JBox.hglue()),
                      JBox.vspace(1),
                      JBox.hbox(JBox.hglue(), spot41, JBox.hspace(1), spot42, JBox.hspace(1), spot43, JBox.hspace(1), spot44, JBox.hspace(1), spot45, JBox.hspace(1), spot46, JBox.hspace(1), spot47, JBox.hspace(1), spot48, JBox.hglue()),
                      JBox.vspace(1),
                      JBox.hbox(JBox.hglue(), spot49, JBox.hspace(1), spot50, JBox.hspace(1), spot51, JBox.hspace(1), spot52, JBox.hspace(1), spot53, JBox.hspace(1), spot54, JBox.hspace(1), spot55, JBox.hspace(1), spot56, JBox.hglue()),
                      JBox.vspace(1),
                      JBox.hbox(JBox.hglue(), spot57, JBox.hspace(1), spot58, JBox.hspace(1), spot59, JBox.hspace(1), spot60, JBox.hspace(1), spot61, JBox.hspace(1), spot62, JBox.hspace(1), spot63, JBox.hspace(1), spot64, JBox.hglue()),
                      JBox.vspace(30),
                      JBox.hbox(JBox.hglue(), Quit, JBox.hspace(70), Reset, JBox.hspace(100), pvp, JBox.hglue()),
                      JBox.vspace(5),
                      JBox.hbox(JBox.hglue(), diffic, JBox.hglue()),
                      JBox.vspace(5),
                      JBox.hbox(diff),
                      JBox.vglue());
        
        
        frame.add(body);
        frame.setVisible(true);
        
        
        //make eventQueue listen to buttons
        
        JEventQueue events=new JEventQueue();
        events.listenTo(Quit,"Quit");
        events.listenTo(Reset,"Reset");
        events.listenTo(spot1, "00");
        events.listenTo(spot2, "01");
        events.listenTo(spot3, "02");
        events.listenTo(spot4, "03");
        events.listenTo(spot5, "04");
        events.listenTo(spot6, "05");
        events.listenTo(spot7, "06");
        events.listenTo(spot8, "07");
        
        events.listenTo(spot9, "10");
        events.listenTo(spot10, "11");
        events.listenTo(spot11, "12");
        events.listenTo(spot12, "13");
        events.listenTo(spot13, "14");
        events.listenTo(spot14, "15");
        events.listenTo(spot15, "16");
        events.listenTo(spot16, "17");
        
        events.listenTo(spot17, "20");
        events.listenTo(spot18, "21");
        events.listenTo(spot19, "22");
        events.listenTo(spot20, "23");
        events.listenTo(spot21, "24");
        events.listenTo(spot22, "25");
        events.listenTo(spot23, "26");
        events.listenTo(spot24, "27");
        
        events.listenTo(spot25, "30");
        events.listenTo(spot26, "31");
        events.listenTo(spot27, "32");
        events.listenTo(spot28, "33");
        events.listenTo(spot29, "34");
        events.listenTo(spot30, "35");
        events.listenTo(spot31, "36");
        events.listenTo(spot32, "37");
        
        events.listenTo(spot33, "40");
        events.listenTo(spot34, "41");
        events.listenTo(spot35, "42");
        events.listenTo(spot36, "43");
        events.listenTo(spot37, "44");
        events.listenTo(spot38, "45");
        events.listenTo(spot39, "46");
        events.listenTo(spot40, "47");
        
        events.listenTo(spot41, "50");
        events.listenTo(spot42, "51");
        events.listenTo(spot43, "52");
        events.listenTo(spot44, "53");
        events.listenTo(spot45, "54");
        events.listenTo(spot46, "55");
        events.listenTo(spot47, "56");
        events.listenTo(spot48, "57");
        
        events.listenTo(spot49, "60");
        events.listenTo(spot50, "61");
        events.listenTo(spot51, "62");
        events.listenTo(spot52, "63");
        events.listenTo(spot53, "64");
        events.listenTo(spot54, "65");
        events.listenTo(spot55, "66");
        events.listenTo(spot56, "67");
        
        events.listenTo(spot57, "70");
        events.listenTo(spot58, "71");
        events.listenTo(spot59, "72");
        events.listenTo(spot60, "73");
        events.listenTo(spot61, "74");
        events.listenTo(spot62, "75");
        events.listenTo(spot63, "76");
        events.listenTo(spot64, "77");
        
        
        
        while(true){
            //human is red comp is blue 
            if(p.isWin()) {
                spot[p.compWin.r1][p.compWin.c1].setBackground(Color.cyan);
                spot[p.compWin.r1][p.compWin.c1].setOpaque(true);
                spot[p.compWin.r1][p.compWin.c1].setBorderPainted(false);
                spot[p.compWin.r2][p.compWin.c2].setBackground(Color.cyan);
                spot[p.compWin.r2][p.compWin.c2].setOpaque(true);
                spot[p.compWin.r2][p.compWin.c2].setBorderPainted(false);
                spot[p.compWin.r3][p.compWin.c3].setBackground(Color.cyan);
                spot[p.compWin.r3][p.compWin.c3].setOpaque(true);
                spot[p.compWin.r3][p.compWin.c3].setBorderPainted(false);
                spot[p.compWin.r4][p.compWin.c4].setBackground(Color.cyan);
                spot[p.compWin.r4][p.compWin.c4].setOpaque(true);
                spot[p.compWin.r4][p.compWin.c4].setBorderPainted(false);
            }
            else if (p.isWinHum()) {
                spot[p.humWin.r1][p.humWin.c1].setBackground(Color.magenta);
                spot[p.humWin.r1][p.humWin.c1].setOpaque(true);
                spot[p.humWin.r1][p.humWin.c1].setBorderPainted(false);
                spot[p.humWin.r2][p.humWin.c2].setBackground(Color.magenta);
                spot[p.humWin.r2][p.humWin.c2].setOpaque(true);
                spot[p.humWin.r2][p.humWin.c2].setBorderPainted(false);
                spot[p.humWin.r3][p.humWin.c3].setBackground(Color.magenta);
                spot[p.humWin.r3][p.humWin.c3].setOpaque(true);
                spot[p.humWin.r3][p.humWin.c3].setBorderPainted(false);
                spot[p.humWin.r4][p.humWin.c4].setBackground(Color.magenta);
                spot[p.humWin.r4][p.humWin.c4].setOpaque(true);
                spot[p.humWin.r4][p.humWin.c4].setBorderPainted(false);
            }
            
            if (diff.getValue() == 1) {
                p.maxDepth = 2;
            }
            else if (diff.getValue() == 2) {
                p.maxDepth = 4;
            }
            else if (diff.getValue() == 3) {
                p.maxDepth  = 6;
            }
            
            
            
            EventObject event=events.waitEvent();
            String name=events.getName(event);
            
            if (name.equals("Quit")) {
                frame.dispose();
            }
            
            if (name.equals("Reset")) {
                gray(spot, p);
            }
            
            
            if (!gameOver(p)) {
                
                
                if ((name.equals("00")) || (name.equals("10"))|| (name.equals("20")) || (name.equals("30"))
                        || (name.equals("40")) || (name.equals("50")) || (name.equals("60") || (name.equals("70")))) {  
                    int col = 0;
                    if (p.board[0][col] == 0){
                        playerOne(p, spot, col, pvp, p1t);
                        p1t =!p1t;
                    }
                }
                
                else if ((name.equals("01")) || (name.equals("11"))|| (name.equals("21")) || (name.equals("31")) 
                             || (name.equals("41")) || (name.equals("51")) || (name.equals("61")) || (name.equals("71"))) {
                    int col = 1;
                    if (p.board[0][col] == 0){
                        playerOne(p, spot, col, pvp, p1t);
                        p1t =!p1t;
                    }
                }
                
                else if ((name.equals("02")) || (name.equals("12"))|| (name.equals("22")) || (name.equals("32")) || (name.equals("42")) || (name.equals("52")) || (name.equals("62")) || (name.equals("72"))) {
                    int col = 2;
                    if (p.board[0][col] == 0){
                        playerOne(p, spot, col, pvp, p1t);
                        p1t =!p1t;
                    } 
                }
                
                else if ((name.equals("03")) || (name.equals("13"))|| (name.equals("23")) || (name.equals("33")) || (name.equals("43")) || (name.equals("53")) || (name.equals("63")) || (name.equals("73"))) {
                    int col = 3;
                    if (p.board[0][col] == 0){
                        playerOne(p, spot, col, pvp, p1t);
                        p1t =!p1t;
                    }  
                }
                
                else if ((name.equals("04")) || (name.equals("14"))|| (name.equals("24")) || (name.equals("34")) || (name.equals("44")) || (name.equals("54")) || (name.equals("64")) || (name.equals("74"))) {
                    int col = 4;
                    if (p.board[0][col] == 0){
                        playerOne(p, spot, col, pvp, p1t);
                        p1t =!p1t;
                    }
                }
                
                else if ((name.equals("05")) || (name.equals("15"))|| (name.equals("25")) || (name.equals("35"))
                             || (name.equals("45")) || (name.equals("55")) || (name.equals("65")) || (name.equals("75"))) {
                    int col = 5;
                    if (p.board[0][col] == 0){
                        playerOne(p, spot, col, pvp, p1t);
                        p1t =!p1t;
                    }  
                }
                
                else if ((name.equals("06")) || (name.equals("16"))|| (name.equals("26")) || (name.equals("36")) || (name.equals("46")) || (name.equals("56")) || (name.equals("66")) || (name.equals("76"))) {
                    int col = 6;
                    if (p.board[0][col] == 0){
                        playerOne(p, spot, col, pvp, p1t);
                        p1t =!p1t;
                    }
                }
                
                else if ( (name.equals("07")) || (name.equals("17"))|| (name.equals("27")) || (name.equals("37")) || (name.equals("47")) || (name.equals("57")) || (name.equals("67")) || (name.equals("77"))) {
                    int col = 7;
                    if (p.board[0][col] == 0){
                        playerOne(p, spot, col, pvp, p1t);
                        p1t =!p1t;
                    }
                }
            }
        }
    }
    
}


