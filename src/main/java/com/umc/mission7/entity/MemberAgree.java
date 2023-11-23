package com.umc.mission7.entity;

import lombok.*;
import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Table(name = "member_agree", schema = "umc")
public class MemberAgree {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "terms_id")
    private Terms terms;

    @Basic
    @Column(name = "created_at")
    private Timestamp createdAt;

    @Basic
    @Column(name = "updated_at")
    private Timestamp updatedAt;


    public void setId(long id) {
        this.id = id;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
