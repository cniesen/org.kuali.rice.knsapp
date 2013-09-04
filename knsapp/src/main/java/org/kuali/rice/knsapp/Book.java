package org.kuali.rice.knsapp;

import java.util.Date;
import java.util.List;

import org.kuali.rice.core.api.util.type.KualiDecimal;
import org.kuali.rice.core.api.util.type.KualiInteger;
import org.kuali.rice.krad.bo.PersistableBusinessObjectBase;

public class Book extends PersistableBusinessObjectBase {
	private static final long serialVersionUID = -2406918292069639330L;

	private Long id;
	private String title;
	private String typeCode;
	private String isbn;
	private String publisher;
	private Date publicationDate;
	private KualiDecimal price;
	private KualiInteger rating;

    private List<Author> authors;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public Date getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(Date publicationDate) {
		this.publicationDate = publicationDate;
	}
	public KualiDecimal getPrice() {
		return price;
	}
	public void setPrice(KualiDecimal price) {
		this.price = price;
	}
	public KualiInteger getRating() {
		return rating;
	}
	public void setRating(KualiInteger rating) {
		this.rating = rating;
	}
    public List<Author> getAuthors() {
        return authors;
    }
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
	
}