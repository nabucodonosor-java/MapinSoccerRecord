import StarFull from 'assets/img/star-full.png';
import StarHalf from 'assets/img/star-half.png';
import StarEmpty from 'assets/img/star-empty.png';
import './styles.css';

const RecordStar = () => {
  return (
    <div className="soccer-stars-container">
        <img src={StarFull} alt="No connection .." />
        <img src={StarFull} alt="No connection .." />
        <img src={StarFull} alt="No connection .." />
        <img src={StarHalf} alt="No connection .." />
        <img src={StarEmpty} alt="No connection .." />
    </div>
  )
}

export default RecordStar