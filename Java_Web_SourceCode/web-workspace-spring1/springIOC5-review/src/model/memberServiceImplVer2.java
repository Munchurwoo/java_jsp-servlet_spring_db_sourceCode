package model;

public class memberServiceImplVer2 implements MemberService{
	
	private MemberDAO memberDAO;
	private PointDAO pointDAO;
	
	public memberServiceImplVer2(MemberDAO memberDAO, PointDAO pointDAO) {
		super();
		this.memberDAO = memberDAO;
		this.pointDAO = pointDAO;
	}
	
	public memberServiceImplVer2() {
		super();
	}
	
	@Override
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}


	@Override
	public void setPointDAO(PointDAO pointDAO) {
		this.pointDAO = pointDAO;
	}

	@Override
	public void registerMemberAndPoint(String memberInfo, int point) {
		memberDAO.register(memberInfo);
		pointDAO.register(memberInfo, point);
	}

}