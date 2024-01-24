package sub5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class CRUDtest {
	public static void main(String[] args) {
					System.out.println("ȸ������ �Ŵ��� v1.0");
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
					while(true) {
						System.out.println("����:0, �Է�:1, ��ȸ:2, �˻�:3, ����:4, ����:5");
						System.out.print("����>");
						try {
							int answer = Integer.parseInt(br.readLine());
							UserDAO dao =UserDAO.getInstance();
							if(answer==0) {
								break;
							}else if(answer==1) {
								//�Է�
								UserDTO user = new UserDTO();

								System.out.print("���̵� �Է� : ");	
								String uid= br.readLine();
								user.setUid(uid);
								
								System.out.print("�̸� �Է� : ");	
								String name= br.readLine();
								user.setName(name);
								
								System.out.print("������� �Է� : ");	
								String birth= br.readLine();
								user.setBirth(birth);
								
								System.out.print("�ּ� �Է� : ");	
								String addr= br.readLine();
								user.setAddr(addr);
							
								dao.insertUser(user);
								
								System.out.println("��� �Ϸ�...");
							}else if(answer==2) {
								//��ȸ
								List<UserDTO> users =dao.selectUsers();
								for(UserDTO user : users) {
									System.out.println(user);
								}
							}else if(answer==3) {
								//�˻�
								System.out.print("���̵� �˻� : ");
								String uid =br.readLine();
								UserDTO user =dao.selectUser(uid);
								if(user == null) {
									System.out.println("�׷� ����� �����ϴ�.");
								}else {
									System.out.println(user);	
								}
							}else if(answer==4) {
								//����
								UserDTO user = new UserDTO();
								
								System.out.print("���� ȸ�� ���̵� �Է� : ");
								String uid=br.readLine();
								user.setUid(uid);
								System.out.print("���� ȸ�� �̸� �Է� : ");
								String name=br.readLine();
								user.setName(name);
								System.out.print("���� ȸ�� ������� �Է� : ");
								String birth=br.readLine();
								user.setBirth(birth);
								System.out.print("���� ȸ�� �ּ� �Է� : ");
								String addr =br.readLine();
								user.setAddr(addr);
								
								dao.updateUser(user);
								System.out.println("���� �Ϸ�..");
							}else if(answer==5) {
								//����
								System.out.print("���� �� ȸ�� ���̵� �Է� : ");
								String uid=br.readLine();
								dao.deleteUser(uid);
								System.out.println("ȸ�� ����..");
							}
						} catch (Exception e) {
							e.printStackTrace();
							System.out.println("��ȿ���� ���� ��û�Դϴ�.");
						} 
					}
					System.out.println("ȸ������ �Ŵ��� ����....");
			
			
	}

}
