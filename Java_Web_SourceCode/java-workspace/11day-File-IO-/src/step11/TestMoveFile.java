package step11;

import java.io.File;

public class TestMoveFile {
	public static void main(String[] args) {
		String orgPath="C:\\java-kosta\\test\\media\\music";
		String destPath = "C:\\java-kosta\\test\\mediaplayer";
		MoveFileService service =  new MoveFileService();
		String ext=".mp3";
		// ���丮�� �ٸ� Ȯ���� ������ �����ϰ� ext �� ��ġ�ϴ� 
		// Ȯ���ڸ� ���� ���ϵ��� destPath ���丮�� ��� �̵� 
		
		//System.out.println(list[1]);
		service.moveAll(orgPath, destPath,ext);
		System.out.println("���丮 �� mp3 ������ ��� �̵� ");
	}
}