/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.36
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package lemurproject.lemur;

public abstract class RetrievalMethod {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RetrievalMethod(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RetrievalMethod obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      lemurJNI.delete_RetrievalMethod(swigCPtr);
    }
    swigCPtr = 0;
  }

        /**
           Run a string query. Specialized by RetrievalMethod subclasses.
           @param searchQuery the query to run
           @return array of IndexedReal results
           @throws Exception if a lemur::api::Exception was thrown by the JNI library.
        */

public  abstract IndexedReal[] runQuery(String searchQuery) throws Exception;
 
  
/**
Score all documents in the collection
@throws Exception if a lemur::api::Exception was thrown by the JNI library.
*/
public void scoreCollection(QueryRep qry, IndexedReal[] results) throws java.lang.Exception {
    lemurJNI.RetrievalMethod_scoreCollection(swigCPtr, this, QueryRep.getCPtr(qry), qry, results);
  }

  
/**
update the query, feedback support
@throws Exception if a lemur::api::Exception was thrown by the JNI library.
*/
public void updateQuery(QueryRep qryRep, WeightedIDSet relDocs) throws java.lang.Exception {
    lemurJNI.RetrievalMethod_updateQuery(swigCPtr, this, QueryRep.getCPtr(qryRep), qryRep, WeightedIDSet.getCPtr(relDocs), relDocs);
  }

}
