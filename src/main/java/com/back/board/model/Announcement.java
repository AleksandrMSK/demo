package com.back.board.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_announcements")
public class Announcement extends GenericEntity {

    @Id
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    @Column(name = "announcement_id")
    private String announcementId;

    @Column(name = "title")
    private String title;

    @Column(name = "body_announcement")
    private String bodyAnnouncement;

    @Column(name = "status")
    private AnnouncementStatus status;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private AnnouncementType type;

    @ManyToOne
    @JoinColumn(name = "person_id", insertable = false, updatable = false)
    private Person person;

    @OneToOne(mappedBy = "announcement", fetch = FetchType.LAZY)
    @JoinColumn(name = "history_changes_anouncement_id", insertable = false, updatable = false)
    private HistoryChangesAnnouncement historyChangesAnnouncement;

}
