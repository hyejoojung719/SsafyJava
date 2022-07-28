package com.ssafy.live5.gui;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

// JFrame 기반 -> 5개 여역
public class LayoutTest extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel lNum1, lNum2, lCorrectCnt, lWrongCnt;
    private JTextField tfAns; // 값 입력 받는 영역
    private int answer; // 정답 

    public static void main(String[] args) {
        LayoutTest lt = new LayoutTest();
        lt.launchUi();
    }

    private void launchUi() {
        this.add(new JLabel("구구단을 외자!"), BorderLayout.NORTH); // 북쪽
        
        makeResultPanel();
        makeProblemPanel();
        // Frame 기본 설정
        this.setTitle("layout test");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 버튼을 닫으면 종료가 되도록
        this.pack(); // JFrame의 사이즈를 안에있는 컨텐츠에 맞게 조절
        this.setVisible(true); // default값이 안보이기 때문에 보여지도록 설정
    }
    
    private void makeProblem() {
        Random rand = new Random();
        int num1 = rand.nextInt(9) + 1;
        int num2 = rand.nextInt(9) + 1;
        this.answer = num1 * num2;
        lNum1.setText(num1 + "");
        lNum2.setText(num2 + "");
        tfAns.setText("");
    }
    
    private void makeResultPanel() {
        // TODO: 결과를 보여줄 panel을 구성하시오.
    	JPanel panel = new JPanel();
    	panel.add(new JLabel("정답 개수 : "));
    	lCorrectCnt = new JLabel("0");
    	panel.add(lCorrectCnt);
    	panel.add(new JLabel("오답 개수 : "));
    	lWrongCnt = new JLabel("0");
    	panel.add(lWrongCnt);
    	
    	this.add(panel, BorderLayout.SOUTH); // 남쪽에 보여주기
        // END:
    }


    
    private void makeProblemPanel() {
        // TODO: 문제를 출제할 패널을 구성하시오.
    	JPanel panel = new JPanel();
    	
    	lNum1 = new JLabel();
    	lNum2 = new JLabel();
    	panel.add(lNum1);
    	panel.add(new JLabel("*"));
    	panel.add(lNum2);
    	panel.add(new JLabel("="));
    	tfAns = new JTextField(10); // 10글자 정도 보여주기
    	panel.add(tfAns);
    	makeProblem();
    	
    	// 엔터키를 누르면 내가 입력한 값이 정답인지 확인하고 싶다
    	tfAns.addKeyListener(new KeyAdapter() {
    		@Override
    		public void keyReleased(KeyEvent e) {
    			if(e.getKeyCode() == 10) {
    				int val = Integer.parseInt(tfAns.getText());
    				if(val == answer) {
    					int pre = Integer.parseInt(lCorrectCnt.getText()); // 숫자로
    					lCorrectCnt.setText(pre+1+""); // 문자열로만 저장할수있어서 ""추가
    				}else {
    					int pre = Integer.parseInt(lWrongCnt.getText()); // 숫자로
    					lWrongCnt.setText(pre+1+""); // 문자열로만 저장할수있어서 ""추가
    				}
    				makeProblem(); // 다시 문제 내주기
    			}
    		}
		});
    	
    	this.add(panel, BorderLayout.CENTER);
        // END:
    }


}
