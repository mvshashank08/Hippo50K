package org.example.rest;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.WebApplicationException;
import javax.jcr.Node;


import org.hippoecm.hst.content.annotations.Persistable;
import org.hippoecm.hst.core.request.HstRequestContext;
//import org.hippoecm.hst.demo.jaxrs.services.util.ResponseUtils;
import org.hippoecm.hst.content.beans.manager.workflow.BaseWorkflowCallbackHandler;
import org.onehippo.repository.documentworkflow.DocumentWorkflow;
import org.apache.commons.lang.StringUtils;
import org.hippoecm.hst.content.beans.manager.workflow.WorkflowPersistenceManager;
import org.hippoecm.hst.container.RequestContextProvider;
import org.hippoecm.hst.content.beans.query.HstQueryManager;
import org.hippoecm.hst.util.PathUtils;
import org.hippoecm.hst.content.beans.query.HstQuery;
import org.hippoecm.hst.content.beans.query.HstQueryResult;
import org.hippoecm.hst.content.beans.standard.HippoBeanIterator;
import org.hippoecm.hst.content.beans.query.filter.Filter;

import org.onehippo.cms7.essentials.components.paging.Pageable;
import org.onehippo.cms7.essentials.components.rest.BaseRestResource;
import org.onehippo.cms7.essentials.components.rest.ctx.DefaultRestContext;
import org.example.beans.DealDocThree;

/**
 * @version "$Id$"
 */

@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, MediaType.APPLICATION_FORM_URLENCODED})
@Path("/DealDocThree/")
public class DealDocThreeResource extends BaseRestResource {

    @GET
    @Path("/")
    public Pageable<DealDocThree> index(@Context HttpServletRequest request) {
        return findBeans(new DefaultRestContext(this, request), DealDocThree.class);
    }

    @GET
    @Path("/page/{page}")
    public Pageable<DealDocThree> page(@Context HttpServletRequest request, @PathParam("page") int page) {
        return findBeans(new DefaultRestContext(this, request, page, DefaultRestContext.PAGE_SIZE), DealDocThree.class);
    }

    @GET
    @Path("/page/{page}/{pageSize}")
    public Pageable<DealDocThree> pageForSize(@Context HttpServletRequest request, @PathParam("page") int page, @PathParam("pageSize") int pageSize) {
        return findBeans(new DefaultRestContext(this, request, page, pageSize), DealDocThree.class);
    }
    
    //edited code

    //get deal by uuid
    @GET
    @Path("/uuid/{uuid}")
    public DealDocThree getDealByUuid(@Context HttpServletRequest request, @PathParam("uuid") String uuid) {

        DealDocThree deal = null;
        
        try{
            HstRequestContext requestContext = RequestContextProvider.get();
            HstQueryManager hstQueryManager = getHstQueryManager(requestContext.getSession(), requestContext);

            String mountContentPath = requestContext.getResolvedMount().getMount().getContentPath();
            Node mountContentNode = requestContext.getSession().getRootNode().getNode(PathUtils.normalizePath(mountContentPath));
            
            //create query
            HstQuery hstQuery = hstQueryManager.createQuery(mountContentNode, DealDocThree.class);
            //set filters
            Filter filter = hstQuery.createFilter();
            filter.addEqualTo("myhippoproject:dealDocThreeBean", uuid);
            hstQuery.setFilter(filter);
            //execute query
            HstQueryResult result = hstQuery.execute();
            //iterator helps retrieve the bean
            HippoBeanIterator iterator = result.getHippoBeans();

            //since there is only one hippobean,
            deal = (DealDocThree) iterator.nextHippoBean();

        }catch (Exception e) {
            e.printStackTrace();
        }
        

        return deal;
    }


    @RolesAllowed( { "admin", "author", "editor" } )
    @Persistable
    @PUT
    @Path("/")
    public DealDocThree update(@Context HttpServletRequest servletRequest, @Context HttpServletResponse servletResponse, @Context UriInfo uriInfo, @QueryParam("wfaction") String workflowAction, DealDocThree dealDocThreeBeanPut){
    	
        DealDocThree dealDocThreeBean = null;
        HstRequestContext requestContext = getRequestContext(servletRequest);

        try {
            dealDocThreeBean = (DealDocThree) getRequestContentBean(requestContext);
        } catch (Exception e) {
            
            
            //throw new WebApplicationException(e, ResponseUtils.buildServerErrorResponse(e));
        }

        try{
            WorkflowPersistenceManager wpm = (WorkflowPersistenceManager) getPersistenceManager(requestContext);
            dealDocThreeBean.setCompany(dealDocThreeBeanPut.getCompany());
            dealDocThreeBean.setLocation(dealDocThreeBeanPut.getLocation());
            dealDocThreeBean.setWebsite(dealDocThreeBeanPut.getWebsite());
            dealDocThreeBean.setIndustry(dealDocThreeBeanPut.getIndustry());
            dealDocThreeBean.setDescription(dealDocThreeBeanPut.getDescription());
            dealDocThreeBean.setFounded(dealDocThreeBeanPut.getFounded());
            dealDocThreeBean.setEmployees(dealDocThreeBeanPut.getEmployees());
            dealDocThreeBean.setRaising(dealDocThreeBeanPut.getRaising());
            dealDocThreeBean.setAnnualRevenue(dealDocThreeBeanPut.getAnnualRevenue());
            dealDocThreeBean.setPrevCapital(dealDocThreeBeanPut.getPrevCapital());
            dealDocThreeBean.setImage(dealDocThreeBeanPut.getImage());

            if (StringUtils.equals("requestPublication", workflowAction)) {
                wpm.setWorkflowCallbackHandler(new BaseWorkflowCallbackHandler<DocumentWorkflow>() {
                    public void processWorkflow(DocumentWorkflow wf) throws Exception {
                        wf.requestPublication();
                    }
                });
            } else if (StringUtils.equals("publish", workflowAction)) {
                wpm.setWorkflowCallbackHandler(new BaseWorkflowCallbackHandler<DocumentWorkflow>() {
                    public void processWorkflow(DocumentWorkflow wf) throws Exception {
                        wf.publish();
                    }
                });
            } else if (StringUtils.equals("requestDepublication", workflowAction)) {
                wpm.setWorkflowCallbackHandler(new BaseWorkflowCallbackHandler<DocumentWorkflow>() {
                    public void processWorkflow(DocumentWorkflow wf) throws Exception {
                        wf.requestDepublication();
                    }
                });
            } else if (StringUtils.equals("depublish", workflowAction)) {
                wpm.setWorkflowCallbackHandler(new BaseWorkflowCallbackHandler<DocumentWorkflow>() {
                    public void processWorkflow(DocumentWorkflow wf) throws Exception {
                        wf.depublish();
                    }
                });
            }

            wpm.update(dealDocThreeBean);
            wpm.save();

            // Note: Retrieve bean again from the repository to return.
            dealDocThreeBean = (DealDocThree) wpm.getObject(dealDocThreeBean.getPath());
        


        }catch(Exception e){
            
            
            //throw new WebApplicationException(e, ResponseUtils.buildServerErrorResponse(e));

        }

        return dealDocThreeBean;

    }
    
}
