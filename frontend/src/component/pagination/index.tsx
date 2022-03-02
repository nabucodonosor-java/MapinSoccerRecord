import Arrow from "assets/img/arrow.png";
import "./styles.css";

const Pagination = () => {
  return (
    <div className="soccer-pagination-container">
        <div className="soccer-pagination-box">
            <button className="soccer-pagination-button" disabled={true} >
                <img src={Arrow} alt="x"/>
            </button>
            <p>{`${1} de ${3}`}</p>
            <button className="soccer-pagination-button" disabled={false} >
                <img className="soccer-flip-horizontal" src={Arrow} alt="x"/> 
            </button>
        </div>
    </div>
  )
}

export default Pagination;