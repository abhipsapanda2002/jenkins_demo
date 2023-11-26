import useFetch from "./useFetch";
import ProdList from "./productList";

const Home = () => {
    // const [name,setname] = useState('sara');
    // const[age,setage] = useState(21);
    // const handleClick = () => {
    //     setname('aman');
    //     setage(15);
    //     console.log('hello');
    // }
    // // const handleClickAgain = (name,e) => {
    // //     console.log('hello' + name,e);
    // }

    
    // const handleDelete = (id) => {
    //    const newBlogs = blogs.filter(blog => blog.id!==id)
    //    setBlogs(newBlogs)
    // }
    
    
    const { error, isLoading, data: prod } = useFetch('http://localhost:3001/products')


    return (  
        <div className="home">
            {error && <div> { error } </div>}
            {isLoading && <div>Loading...</div>} 
          {prod && <ProdList prods = {prod} title = "All Products!" /> }
          {/* <BlogList blogs = {blogs.filter((blogs) => blogs.author==='mario')} title = "Mario's Blogs!" handleDelete = {handleDelete} />     */}
            {/* <button onClick = {() => {setName('aman')}}>change name</button> */}
            {/* blogs is the props used to pass in BlogList */}
            {/* <p>{ name }</p> */}
        </div>
    );
}
 
export default Home;