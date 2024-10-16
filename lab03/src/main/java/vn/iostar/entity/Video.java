package vn.iostar.entity;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor; 
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="videos")
@NamedQuery(name="Video.findAll", query="SELECT v FROM Video v")
public class Video implements Serializable{

	
	private static final long serialVersionUID = 1L;
	 
	@Id
	@Column(name="VideoId")
	private String videoId;

	@Column(name="Active")
	private int active;

	@Column(name="Description", columnDefinition = "NVARCHAR(MAX)")
	private String description;

	@Column(name="Poster")
	private String poster;
		
	@Column(name="Title", columnDefinition = "NVARCHAR(MAX)")
	private String title;

	@Column(name="Views")
	private int views;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="CategoryId")
	private Category category;

	//constructor, getters, setters tu sinh ra voi LomBok
	
	
}	
