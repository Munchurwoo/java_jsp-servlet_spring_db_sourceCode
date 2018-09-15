package test;

import model.Hammer;
import model.Spade;
import model.Tool;

// 기존 제어 방식
// 어플리케이션에서 필요로 하는 요소(객체)를 
// 직접 생성 또는 확보해서 사용한다.

public class TestControl {
	public static void main(String[] args) {
		/*Hammer h = new Hammer();
		h.work();*/
		/*Spade s = new Spade();
		s.work();*/
		Tool t = new Spade();
		t.work();
	}
}