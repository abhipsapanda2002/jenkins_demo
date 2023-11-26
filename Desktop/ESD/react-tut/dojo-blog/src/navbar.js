import { Link } from "react-router-dom";
import image from './cart.svg';
import pimg from './person.svg';


/*const Navbar = () => {
  return (
    <nav className="navbar">
      <h1>The Dojo Blog</h1>
      <div className="links">
        <Link to="/">Home</Link>
        <Link to="/create" style={{ 
          color: 'white', 
          backgroundColor: '#f1356d',
          borderRadius: '8px' 
        }}>New Blog</Link>
      </div>
    </nav>
  );
}*/
/*import { Link } from "react-router-dom";*/

const Navbar = () => {
  return (
    <nav className="navbar">
      <h1>Shopping Site</h1>
      <div className="float-left">
        <Link to="/">Home</Link>
        <Link to="/">Category</Link>
      </div>
      <form class="d-flex" role="search">
          <input
            class="form-control me-2"
            type="search"
            placeholder="Search"
            aria-label="Search"
          />
          <button class="btn btn-outline-success" type="submit">Search Products</button>
        </form>
      <div className="float-end">
        <Link to="/cart">Cart</Link>
        <img src= {image} alt="cart" />
        <Link to="/profile">Profile</Link>
        <img src= {pimg} alt="profile" />
      </div>
    </nav>
  );
}
 
export default Navbar;