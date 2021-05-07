import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class SaveID {

	public void write2file(String cbuf) {
		File file = null;//���ȶ����ļ���
		OutputStream os = null;//�����ֽ���
		OutputStreamWriter osw = null;//OutputStreamWriter���ֽ���ͨ���ַ�����������
		BufferedWriter bw = null;//���建����
		
		
		try {
			file = new File("./file/ID.txt"); //�½��ļ�����
			//���ļ�ϵͳ�е�ĳ���ļ��л�ȡ�ֽ�
			os = new FileOutputStream(file, true);//true��append��Ϊ��������������ԭ�ļ�ĩ��׷�ӡ�
			//���ֽ���ת�����ַ���
			osw = new OutputStreamWriter(os);
			//�ѽ��յ����ַ������뻺��������߶�д�ٶȡ�
			bw = new BufferedWriter(osw);
			//���ַ�����������ʽд���ļ�
			bw.write(cbuf);
		} catch (FileNotFoundException e) {
			System.out.println("�Ҳ���ָ���ļ�");
		} catch (IOException e) {
			System.out.println("д���ļ�����");
		} finally {
				try {
					//�ر��ļ��ŵ�finally����۶�ȡ�Ƿ�ɹ�����Ҫ�����رա�
					//�رյ�˳����󿪵��ȹرգ�ջ���Ƚ����ԭ����
					bw.close();
					osw.close();
					os.close();
					} catch (IOException e) {
						System.out.println("�ļ����޷��ر�");
					}
			}	
	}
}