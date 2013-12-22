class StaticPagesController < ApplicationController

	def download
    	send_file '/public/FeedMe.zip', :type=>"application/zip" 
    	render 'new'
  	end


  	def new
  		render 'new'
  	end
end
