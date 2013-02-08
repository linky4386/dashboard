package dashboard

class Gadget {
	String contents;
	String title;
	Date lastModified;
	String lastModifiedBy;

    static constraints = {
		title(nullable: false, blank: false)
		contents(nullable: false, blank: true)
		lastModified(required: true, nullable: false)
		lastModifiedBy(nullable: true, blank: true)
    }
}
