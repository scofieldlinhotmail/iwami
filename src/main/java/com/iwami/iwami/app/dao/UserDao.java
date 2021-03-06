package com.iwami.iwami.app.dao;

import java.util.Date;

import com.iwami.iwami.app.model.Code;
import com.iwami.iwami.app.model.User;

public interface UserDao {
	
	public User getUserById(long id);

	public boolean subUserCurrentPrize4Draw(long userid, int prize);

	public boolean addCode(Code code);

	public Code getCode(long cellPhone, String code, Date start);

	public User getUserByCellPhone(long cellPhone);

	public boolean newUser4Register(User user);

	public boolean addUserInfo4Register(User user);

	public boolean updateUser4Register(User user);

	public boolean modifyUserInfo4Register(User user);
	
	boolean getUseridStatus(long userid);
	
	User getUser(long userid);
	
	boolean getCellphoneStatus(long cellPhone);

	User getUserByCellphone(long cellPhone);
	
	int subCurrPrize(long userid,int prize);
	
	boolean addCurrPrize(long userid,int prize);
	

}
