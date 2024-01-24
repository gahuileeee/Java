package sub5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class CRUDtest {
	public static void main(String[] args) {
					System.out.println("회원관리 매니저 v1.0");
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
					while(true) {
						System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
						System.out.print("선택>");
						try {
							int answer = Integer.parseInt(br.readLine());
							UserDAO dao =UserDAO.getInstance();
							if(answer==0) {
								break;
							}else if(answer==1) {
								//입력
								UserDTO user = new UserDTO();

								System.out.print("아이디 입력 : ");	
								String uid= br.readLine();
								user.setUid(uid);
								
								System.out.print("이름 입력 : ");	
								String name= br.readLine();
								user.setName(name);
								
								System.out.print("생년월일 입력 : ");	
								String birth= br.readLine();
								user.setBirth(birth);
								
								System.out.print("주소 입력 : ");	
								String addr= br.readLine();
								user.setAddr(addr);
							
								dao.insertUser(user);
								
								System.out.println("등록 완료...");
							}else if(answer==2) {
								//조회
								List<UserDTO> users =dao.selectUsers();
								for(UserDTO user : users) {
									System.out.println(user);
								}
							}else if(answer==3) {
								//검색
								System.out.print("아이디 검색 : ");
								String uid =br.readLine();
								UserDTO user =dao.selectUser(uid);
								if(user == null) {
									System.out.println("그런 사람은 없습니다.");
								}else {
									System.out.println(user);	
								}
							}else if(answer==4) {
								//수정
								UserDTO user = new UserDTO();
								
								System.out.print("수정 회원 아이디 입력 : ");
								String uid=br.readLine();
								user.setUid(uid);
								System.out.print("수정 회원 이름 입력 : ");
								String name=br.readLine();
								user.setName(name);
								System.out.print("수정 회원 생년월일 입력 : ");
								String birth=br.readLine();
								user.setBirth(birth);
								System.out.print("수정 회원 주소 입력 : ");
								String addr =br.readLine();
								user.setAddr(addr);
								
								dao.updateUser(user);
								System.out.println("수정 완료..");
							}else if(answer==5) {
								//삭제
								System.out.print("삭제 할 회원 아이디 입력 : ");
								String uid=br.readLine();
								dao.deleteUser(uid);
								System.out.println("회원 삭제..");
							}
						} catch (Exception e) {
							e.printStackTrace();
							System.out.println("유효하지 않은 요청입니다.");
						} 
					}
					System.out.println("회원관리 매니저 종료....");
			
			
	}

}
