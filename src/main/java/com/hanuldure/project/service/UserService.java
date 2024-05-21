package com.hanuldure.project.service;

import org.springframework.stereotype.Service;
import com.hanuldure.project.model.User;

@Service
public class UserService {

    public User getUserById(String userId) {
        // 실제로는 DB에서 사용자 정보를 조회해야 하지만, 여기서는 예제 데이터를 사용
        User user = new User();
        user.setUserId(userId);
        user.setUserName("사용자 닉네임");
        user.setUserPhone("010-0000-0000");
        user.setUserRegion("서울");
        user.setUserIntro("농촌 체험하는 걸 좋아합니다.");
        user.setUserImg("/path/to/image.jpg");
        return user;
    }
}
