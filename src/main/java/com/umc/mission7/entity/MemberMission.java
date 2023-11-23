package com.umc.mission7.entity;

import lombok.*;
import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "member_mission", schema = "umc")
public class MemberMission {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Mission mission;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Basic
    @Column(name = "field")
    private String field;

    public void setField(String field) {
        this.field = field;
    }
}
