package xjh.loveHome.IC.mode.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSysExceptionLog<M extends BaseSysExceptionLog<M>> extends Model<M> implements IBean {

	public void setId(java.math.BigInteger id) {
		set("id", id);
	}
	
	public java.math.BigInteger getId() {
		return get("id");
	}

	public void setUrl(java.lang.String url) {
		set("url", url);
	}
	
	public java.lang.String getUrl() {
		return getStr("url");
	}

	public void setAddress(java.lang.String address) {
		set("address", address);
	}
	
	public java.lang.String getAddress() {
		return getStr("address");
	}

	public void setInstance(java.lang.String instance) {
		set("instance", instance);
	}
	
	public java.lang.String getInstance() {
		return getStr("instance");
	}

	public void setMethod(java.lang.String method) {
		set("method", method);
	}
	
	public java.lang.String getMethod() {
		return getStr("method");
	}

	public void setSource(java.lang.String source) {
		set("source", source);
	}
	
	public java.lang.String getSource() {
		return getStr("source");
	}

	public void setException(java.lang.String exception) {
		set("exception", exception);
	}
	
	public java.lang.String getException() {
		return getStr("exception");
	}

	public void setHappenedTime(java.util.Date happenedTime) {
		set("happenedTime", happenedTime);
	}
	
	public java.util.Date getHappenedTime() {
		return get("happenedTime");
	}

	public void setCreatedUserId(java.lang.Long createdUserId) {
		set("createdUserId", createdUserId);
	}
	
	public java.lang.Long getCreatedUserId() {
		return getLong("createdUserId");
	}

	public void setReplicatorId(java.lang.Long replicatorId) {
		set("replicatorId", replicatorId);
	}
	
	public java.lang.Long getReplicatorId() {
		return getLong("replicatorId");
	}

	public void setIsDelete(java.lang.Boolean isDelete) {
		set("isDelete", isDelete);
	}
	
	public java.lang.Boolean getIsDelete() {
		return get("isDelete");
	}

}