import RecordStar from 'component/record-stars';
import './styles.css';

const RecordScore = () => {

    const score = 3.5;
    const count = 13;

  return (
    <div className='soccer-score-container'> 
        <p className='soccer-score-value'>{score > 0 ? score.toFixed(1) : '-'}</p>
        <RecordStar />
        <p className='soccer-score-count'>{count} avaliações</p>
    </div>
  )
}

export default RecordScore;