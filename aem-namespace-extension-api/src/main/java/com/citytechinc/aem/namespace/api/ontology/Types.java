package com.citytechinc.aem.namespace.api.ontology;

public class Types {

    private Types() {}

    /**
     * Represents the root of a particular section of a site.  It is common to break a site's content 
     * up into logical sections and sub sections.  Section pages allow for this logical separation of 
     * trees of content into sections.  Section pages may be nested to allow any level of sub sectioning.
     */
    public static final String CITYTECH_SECTION_LANDING_PAGE = Namespace.CITYTECH + ":SectionLandingPage";

    /**
     * The Home or Root page of a site.  A page in a content tree can always identify its home page 
     * by traversing upwards from itself until it finds a page of type HomePage.  A HomePage in general 
     * should not be nested under another HomePage.
     */
    public static final String CITYTECH_HOME_PAGE = Namespace.CITYTECH + ":HomePage";

    /**
     * TODO: Consider removal of this type as I do not think it is being used anymore
     */
    public static final String CITYTECH_HIERARCHICAL_PAGE = Namespace.CITYTECH + ":HierarchicalPage";

    /**
     * Attributable to the jcr:content Resource which is a direct child of a Resource of type 
     * cq:Page.  Indicates that the page is a structural page meaning that it does not have any 
     * semantic meaning in the tree of content but exists to hold authored content, potentially 
     * authored configuration, or simply to establish high level layout of a content tree. 
     * 
     * A country page is a good example of a structural page.  In a content tree such as the following: 
     * 
     *   + application-name (structural page)
     *   |
     *   +--+ country-name (structural page)
     *      |
     *      +--+ language-name (home page)
     *
     * the application and country pages can be created as structural pages allowing for the authoring 
     * of application and country level configurations and content without imposing any meaning 
     * on the pages themselves.
     */
    public static final String CITYTECH_STRUCTURAL_PAGE = Namespace.CITYTECH + ":StructuralPage";

}
