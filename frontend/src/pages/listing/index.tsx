import Pagination from 'component/pagination';
import RecordCard from 'component/record-card';

const Listing = () => {
  return (
    <>    
      <Pagination />
      <div className='container'>
        <div className='row'>
          <div className='col-sm-6 col-lg-4 col-xl-3 mb-3'>
          <RecordCard />
          </div>
          <div className='col-sm-6 col-lg-4 col-xl-3 mb-3'>
          <RecordCard />
          </div>
          <div className='col-sm-6 col-lg-4 col-xl-3 mb-3'>
          <RecordCard />
          </div>
          <div className='col-sm-6 col-lg-4 col-xl-3 mb-3'>
          <RecordCard />
          </div>
          <div className='col-sm-6 col-lg-4 col-xl-3 mb-3'>
          <RecordCard />
          </div>
        </div>
      </div>
    </>

  )
}

export default Listing;