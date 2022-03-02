import Navbar from "component/navbar";
import Form from "pages/form";
import Listing from "pages/listing";
import { BrowserRouter, Routes, Route} from "react-router-dom";

const RoutesApp = () => {
  return (
    <BrowserRouter>
    <Navbar />
    <Routes>
      <Route path="/" element={<Listing />} />
      <Route path="/form">
        <Route path=":recordId" element={<Form />} />
      </Route>
    </Routes>
    </BrowserRouter>
  );
}

export default RoutesApp;