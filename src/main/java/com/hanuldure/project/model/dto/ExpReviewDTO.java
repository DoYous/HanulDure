package com.hanuldure.project.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ExpReviewDTO {

    private int revSeq;             // 체험후기번호

    private int userSeq;            // 유저번호
    private String userId;          // userSeq를 통해 user 테이블에서 join

    private String revContent;      // 후기내용
    private String revWriteDate;    // 작성일시

    public ExpReviewDTO(int revSeq, int userSeq, String userId, String revContent, String revWriteDate) {
        this.revSeq = revSeq;
        this.userSeq = userSeq;
        this.userId = userId;
        this.revContent = revContent;
        this.revWriteDate = revWriteDate;
    }
}
